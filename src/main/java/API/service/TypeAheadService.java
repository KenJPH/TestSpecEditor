package API.service;

import API.configurations.DictionaryConfiguration;
import API.dto.ResponseDto;
import API.dto.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TypeAheadService {

    @Autowired
    DictionaryConfiguration dictionaryConfiguration;

    public ResponseDto getWords(List<Token> tokens) {
        // Map<category, ListOfWords>
        Map<String, List<String>> dictMap = dictionaryConfiguration.getDict();


        ResponseDto response = new ResponseDto();

        // Right now it is fixed and randomly grabs categories and the corresponding words
        // Here is where you come in, figure out the logic
        response.setAdjective(dictMap.get("adjective"));
        response.setNoun(dictMap.get("noun"));
        response.setDeterminer(dictMap.get("determiner"));


        return response;
    }

}
