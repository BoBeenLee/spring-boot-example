package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoControllerTests {
    @Autowired
    protected WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).alwaysExpect(
                status().isOk()).build();
    }

    @Test
    public void testGroupBy() throws Exception {
        try {
            this.mockMvc
                    .perform(
                            get("/order/api/group/team").contentType(
                                    MediaType.APPLICATION_JSON))
                    .andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void orderLineChart() throws Exception {
        try {
            this.mockMvc
                    .perform(
                            get("/order/api/linechart/2015").contentType(
                                    MediaType.APPLICATION_JSON))
                    .andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
