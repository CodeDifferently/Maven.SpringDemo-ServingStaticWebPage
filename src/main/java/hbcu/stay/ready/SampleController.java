package hbcu.stay.ready;


import hbcu.stay.ready.utils.FileReader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value="/sample")
    public String methodName() {
        return FileReader.readFile("webapp/Sample.html");
    }
}
