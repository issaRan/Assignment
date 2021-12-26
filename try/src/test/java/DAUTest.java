import com.dau.Interfaces.Model;
import com.dau.Interfaces.Parser;
import com.dau.Interfaces.Service;
import com.dau.Parsers.BasicParser;
import com.dau.controller.DAUController;
import com.dau.models.basicModel;
import com.dau.service.BasicService;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DAUTest {

    private String test = "input.txt";

    @Test
    public void main() {
        Parser<List<String>> basicParser = new BasicParser();
        Model<Map<String, HashSet<String>>> model = new basicModel();
        Service<String, HashMap<String, HashSet<String>>> basicService = new BasicService(basicParser, model, test);
        DAUController<Map<String, HashSet<String>>> dauController = new DAUController(basicService);
        dauController.process();
        assertEquals(3,((HashMap<String, HashSet<String>>) dauController.getDAUByDate("01/01/2020")).get("01/01/2020").size());
        assertEquals(2,((HashMap<String, HashSet<String>>) dauController.getDAUByDate("02/01/2020")).get("02/01/2020").size());
        assertEquals(2,((HashMap<String, HashSet<String>>) dauController.getDAUByDate("03/01/2020")).get("03/01/2020").size());
    }
}