package test;

import com.yy.mapper.CountryDao;
import com.yy.model.Country;

public class MapperTest {
    private CountryDao dao;
    public void test(){
        Country country = dao.selectByPrimaryKey(1);
    }
}
