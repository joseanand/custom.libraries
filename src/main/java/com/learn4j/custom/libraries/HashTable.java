/**
 * 
 */
package com.learn4j.custom.libraries;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * @author jose
 *
 */
public class HashTable<K, V> {
    
    Entry<K, V> [] data;

    /**
     * 
     */
    public HashTable() {
        data =  new Entry [10];
    }
    
    public void put(String key, String value) {
        int hashCode = key.hashCode() % data.length;
        if (data[hashCode] == null) {
            data[hashCode] = new Entry (key, value, null);
        } else {
            data[hashCode] = new Entry (key, value, data[hashCode]);
        }
    }
    
    public String get(String key){
        int hashCode = key.hashCode() % data.length;
        if (data[hashCode] != null) {
            Entry<K, V> e = data[hashCode];
            while (e != null) {
                if (e.key.equals(key)) {
                    return e.value;
                } else {
                    e = e.next();
                }
            }
        } else {
            throw new NoSuchElementException("No key present");
        }
        return null;
    }
    
    public class Entry<Key, value> {
        
        private String key;
        private String value;
        private Entry<Key, value> next;
        
        public Entry(String key, String value, Entry<Key, value> next) {
            this.key = key;
            this.value = value;
            this.next =next;
        }
        
        public Entry<Key, value> next() {
            return this.next;
        }
    }

}
