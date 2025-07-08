package cust;

import eud.sm.dto.Cust;
import eud.sm.service.CustService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    public void selectAll(){
        CustService custService = new CustService();
        List<Cust> lists = null;
        List<Cust> lists2 = null;
        try {
            lists = custService.get();
            lists2 = custService.get();
            lists.forEach(System.out::println);
            lists2.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("조회 실패");
        }
    }
}
