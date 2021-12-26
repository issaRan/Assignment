import com.dau.Interfaces.Model;
import com.dau.Interfaces.Parser;
import com.dau.Interfaces.Service;
import com.dau.controller.DAUController;
import com.dau.models.basicModel;
import com.dau.Parsers.BasicParser;
import com.dau.service.BasicService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DAU {
    public static void main(String[] args) {
        Parser<List<String>> basicParser = new BasicParser();
        Model<Map<String, HashSet<String>>> model = new basicModel();
        Service<String, HashMap<String, HashSet<String>>> basicService = new BasicService(basicParser,model,args[0]);
        DAUController<Map<String, HashSet<String>>> dauController = new DAUController(basicService);
        dauController.process();
        HashMap<String, HashSet<String>> s = (HashMap<String, HashSet<String>>) dauController.getAllDAU();
        HashMap<String, HashSet<String>> s1 = (HashMap<String, HashSet<String>>) dauController.getDAUByDate("02/01/2020");
    }
}
