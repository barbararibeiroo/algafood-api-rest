package com.algaworks.algalog.domain.service;

import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {

    private EntregaRepository entregaRepository;
    private BuscaEntregaService buscaEntregaService;
    public void finalizar(Long entregaId){
        Entrega entrega = buscaEntregaService.buscar(entregaId);
        entrega.finalizar();
        entregaRepository.save(entrega);
    }
}
