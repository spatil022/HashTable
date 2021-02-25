package com.bridgelabz.UC3;


public class MyHashMap<K, V> {
	MyLinkedList<K> myList;
	public MyHashMap() {
		this.myList = new MyLinkedList<>();
	}
	public V get(K key) {
		MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();

	}
	public void add(K key, V value) {
		MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myList.search(key);
		if(mapNode == null) {
			mapNode = new MyHashMapNode<>(key, value);
			this.myList.append(mapNode);
		}
		else {
			mapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{ "+myList+" }";
	}
} 