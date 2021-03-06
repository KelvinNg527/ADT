/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author KELVIN
 */
public class Entry<Y,E> {

        private final Y key;
        private final E value;
        private final boolean inTable;

        Entry(Y searchKey, E dataValue) {
            key = searchKey;
            value = dataValue;
            inTable = true;
        }

        public Y getKey() {
            return key;
        }

        public E getValue() {
            return value;
        }

        boolean isFull() //occupied
        {
            return inTable;
        }

        boolean isEmpty()
        {
            return !inTable;
        }

    }


