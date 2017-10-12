/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author user
 */
@RemoteServiceRelativePath("romanConvert")
public interface RomanConverterService extends RemoteService {

    /**
     * Convertion Chiffre romain en chiffre arabe
     *
     * @param nbr
     * @return
     * @throws IllegalArgumentException
     */
    Integer convertRomanToArabe(String nbr) throws IllegalArgumentException;

    String convertArabeToRoman(Integer nbr) throws IllegalArgumentException;

    String convertDateYears(String nbr) throws IllegalArgumentException;

}
