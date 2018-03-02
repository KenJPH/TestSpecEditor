package API.resolver;

import API.dto.ResponseDto;
import API.dto.Token;

import java.util.List;
import java.util.Map;

public abstract class TypeAheadResolver {


    /**
     * Resolves the next available categories and their corresponding words
     *
     * @param tokens
     * @param dictionary
     * @return A list of categories and their corresponding words
     */
    public abstract ResponseDto getTypeAheadData(List<Token> tokens, Map<String, List<String>> dictionary);

}
