package API.resolver;

import API.dto.ResponseDto;
import API.dto.Token;

import java.util.List;
import java.util.Map;

public class TypeAheadResolverBasic extends TypeAheadResolver {

    /**
     * Resolves the next available categories and their corresponding words
     * which is syntactically correct based on the _____ theory.
     *
     * @param tokens
     * @param dictionary
     * @return A list of categories and their corresponding words to make it syntactically correct
     */
    @Override
    public ResponseDto getTypeAheadData(List<Token> tokens, Map<String, List<String>> dictionary) {
        return null;
    }
}
