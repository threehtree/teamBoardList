package org.zerock.teamwebboard.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.zerock.teamwebboard.domain.Contract;
import org.zerock.teamwebboard.domain.Requester;
import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.dto.RequesterDTO;
import org.zerock.teamwebboard.mapper.ContractMapper;
import org.zerock.teamwebboard.mapper.RequesterMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Log4j2

public class RequesterServiceImpl {
    private final RequesterMapper requesterMapper;
    private final ModelMapper modelMapper;

    public ListResponseDTO<RequesterDTO> getRequesterList(ListDTO listDTO) {
        List<Requester> collectorsList = requesterMapper.selectRequesterList(listDTO);

        List<RequesterDTO> dtoList =
                collectorsList.stream().map(requester -> modelMapper.map(requester, RequesterDTO.class))
                        .collect(Collectors.toList());

        return ListResponseDTO.<RequesterDTO>builder()
                .dtoList(dtoList)
                .total(requesterMapper.getRequesterTotal(listDTO))
                .build();

    }
}
