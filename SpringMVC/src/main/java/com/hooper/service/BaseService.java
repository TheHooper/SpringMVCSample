package com.hooper.service;

import java.security.NoSuchAlgorithmException;

/**
 * Created by hooper on 2016/11/30.
 */
public interface BaseService<E,PK> {

    public E get(PK pk);

    public void insert(E e) throws NoSuchAlgorithmException;

    public void modify(E e);

    public void delete(PK pk);

}
