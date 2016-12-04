package com.hooper.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fruit")
public class Fruit  implements InitializingBean,DisposableBean {

	String name;
	int quality;

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getQuality() {
		return quality;
	}

	@XmlElement
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Fruit(String name, int quality) {
		this.name = name;
		this.quality = quality;
	}

	public Fruit() {
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("执行InitAndDestroySeqBean: postConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行InitAndDestroySeqBean: afterPropertiesSet");
	}

	@PreDestroy
	public void preDestroy()  {
		System.out.println("执行InitAndDestroySeqBean: preDestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("执行InitAndDestroySeqBean: destroy");
	}

}