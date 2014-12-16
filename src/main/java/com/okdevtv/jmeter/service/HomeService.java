package com.okdevtv.jmeter.service;

import org.springframework.stereotype.Service;

import com.okdevtv.jmeter.domain.HomeVo;

@Service
public class HomeService {

	public HomeVo getHome() {
		HomeVo homeVo = new HomeVo("Seoul", 10);
		return homeVo;
	}

}
