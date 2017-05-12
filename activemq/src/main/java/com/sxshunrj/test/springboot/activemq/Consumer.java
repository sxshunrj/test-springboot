package com.sxshunrj.test.springboot.activemq;/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String text) {
		System.out.println(Consumer.class.getName()+"-1->"+text);
	}

	@JmsListener(destination = "sample.queue2")
	public void receiveQueue2(String text) {
		System.out.println(Consumer.class.getName()+"-2->"+text);
	}

}
