package org.zerock.mapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.mapper.ContractMapper;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")

public class ContractMapperTests {
    @Autowired(required = false)
    private ContractMapper contractMapper;

    @Test
    public void testContract(){
        ListDTO listDTO = new ListDTO();
        contractMapper.getContractTotal(listDTO);
    }

    @Test
    public void testgetContractTotal(){
        ListDTO listDTO = new ListDTO();
        contractMapper.getContractTotal(listDTO);
    }
}
