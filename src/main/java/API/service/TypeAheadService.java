package API.service;

import API.configurations.DictionaryConfiguration;
import API.dto.ResponseDto;
import API.dto.Token;
import API.resolver.TypeAheadResolver;
import API.resolver.TypeAheadResolverBasic;
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

        TypeAheadResolver resolver = new TypeAheadResolverBasic();
        ResponseDto typeAheadData = resolver.getTypeAheadData(tokens, dictMap);

        return typeAheadData;
    }

}
