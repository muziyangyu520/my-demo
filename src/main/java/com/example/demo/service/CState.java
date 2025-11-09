package com.example.demo.service;

/**
 * @author lx
 * @date 2025/11/7 11:05
 * @description
 */
public abstract class CState {

	// 飞行里程
	private int flyMiles;

	abstract double travel(int miles);
}
