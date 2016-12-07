package com.hooper.service;

import java.security.NoSuchAlgorithmException;

/**
 * Created by hooper on 2016/11/30.
 */
public interface BaseService<E,PK> {

    public E get(PK pk) throws Exception;

    public void insert(E e) throws Exception;

    public void modify(E e) throws Exception;

    public void delete(PK pk) throws Exception;

}
