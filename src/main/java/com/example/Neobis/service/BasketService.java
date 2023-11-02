package com.example.Neobis.service;

import com.example.Neobis.entity.Basket;
import com.example.Neobis.entity.Product;
import com.example.Neobis.entity.User;
import com.example.Neobis.mapper.BasketMapper;
import com.example.Neobis.model.BasketModel;
import com.example.Neobis.repository.BasketRepo;
import com.example.Neobis.repository.ProductRepo;
import com.example.Neobis.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BasketService {
    private BasketRepo basketRepo;
    private ProductRepo productRepo;
    private UserRepo userRepo;


}
