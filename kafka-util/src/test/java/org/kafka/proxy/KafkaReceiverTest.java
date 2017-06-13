package org.kafka.proxy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kafka.common.KafkaExecuteStrategy;
import org.kafka.consumer.common.KafkaConsumerConfig;
import org.kafka.utils.KafkaUtils;

/**
*
*@author Devonmusa
*@date   2017年5月20日
*/
public class KafkaReceiverTest {
	private KafkaConsumerConfig kafkaConsumerConfig;
	private KafkaReceiveProxy kafkaReceiverProxy;
	private Properties props;
	
	@Before
	public void setUp() throws FileNotFoundException, IOException, Exception {
		KafkaUtils.initLogback();
		props = new Properties();
		kafkaConsumerConfig =KafkaConsumerConfig.getInstance();
		kafkaConsumerConfig.setProperties(props);
		kafkaConsumerConfig.setTopic("DEFAULT_TOPIC.Q");
		kafkaConsumerConfig.setZookeeperUrl("192.168.1.17:2181");
		//kafkaConsumerConfig.setZookeeperUrl("123.207.161.145:2181");
		kafkaReceiverProxy = new KafkaReceiveProxy(kafkaConsumerConfig, KafkaExecuteStrategy.Async);
		
	}
	
	@Test
	public void testAsyncReceiver() {
		kafkaReceiverProxy.receive();
	}

	@After
	public void tearDown() {
		try {
			Thread.sleep(1000 * 50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		kafkaReceiverProxy.close();
	}
}