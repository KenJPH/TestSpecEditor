package API.util;

import API.entity.Token;

import java.util.*;

public class CategoryBuilder {


    Map<Token, Set<String>> result = new HashMap<>();

    public CategoryBuilder add(Token key, String...values) {
        Set set = new HashSet<String>();
        set.addAll(Arrays.asList(values));
        result.put(key, set);
        return this;
    }

    public Map<Token, Set<String>> build(){
        return result;
    }
}
