package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class WebJspApplicationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testJspWithEl() throws Exception {
        ResponseEntity<String> entity = restTemplate.getForEntity("/", String.class);
        Assert.assertEquals(entity.getStatusCode(), HttpStatus.OK);
        Assert.assertSame(entity.getBody(),"Hello JSP");
    }

}