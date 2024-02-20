package max.dev.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController


public class SetController {
    @RequestMapping(value = "/max")
    public List<Object> search(){
         return  List.of(new Max(1,"Belle formation",1));

    }
}
