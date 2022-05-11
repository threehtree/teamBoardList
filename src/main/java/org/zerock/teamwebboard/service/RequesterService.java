package org.zerock.teamwebboard.service;

import org.zerock.teamwebboard.dto.ContractDTO;
import org.zerock.teamwebboard.dto.ListDTO;
import org.zerock.teamwebboard.dto.ListResponseDTO;
import org.zerock.teamwebboard.dto.RequesterDTO;

public interface RequesterService {
    ListResponseDTO<RequesterDTO> getRequesterList(ListDTO listDTO);
}