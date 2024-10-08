package com.bistu.ckkj.service.impl;

import com.bistu.ckkj.mapper.TokenMapper;
import com.bistu.ckkj.pojo.Token;
import com.bistu.ckkj.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TokenServiceImpl implements TokenService {
        private final TokenMapper tokenMapper;

    @Override
    public void addToken(Token token) {
        tokenMapper.insertToken(token);
    }

    @Override
    public void deleteToken(String token) {
        tokenMapper.deleteToken(token);
    }

    @Override
    public List<Token> selectAllToken() {
        List<Token> tokens = tokenMapper.selectAllToken();
        if (tokens.isEmpty()) {
            return List.of(); // 返回空列表
        }
        return tokens;
    }

    @Override
    public Token selectTokenById(String token) {
        return tokenMapper.selectTokenById(token);
    }

    @Override
    public void updateTokenById(Token token) {
        tokenMapper.updateToken(token);
    }

    @Override
    public Token selectTokenByUser(String user) {
        return tokenMapper.selectTokenByUser(user);
    }
}
