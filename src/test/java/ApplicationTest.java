import com.wky.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;

 import static org.junit.Assert.*;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
@AutoConfigureMockMvc
public class ApplicationTest {
    @Resource
    private WebApplicationContext webApplicationContext;

    @Resource
    private MockMvc mockMvc;
    @Test
    public void testStartUp(){
        assertNotNull(webApplicationContext);
        assertNotNull(mockMvc);
    }
}
