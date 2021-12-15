package br.com.ShopAll.microservice.ShopAll_Transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ShopAll.microservice.ShopAll_Transportadora.Repository.TransporteRepository;
import br.com.ShopAll.microservice.ShopAll_Transportadora.model.Transporte;

@Service
public class TransporteService {

	@Autowired
	private TransporteRepository transporteRepository;

	public List<Transporte> getAllTransportes() {
		return transporteRepository.findAll();
	}

	public List<Transporte> getTranportePorStatus(String status) {
		return transporteRepository.findByStatusDoPedido(status);
	}

	public void novoTransporte(Transporte transporte) {
		transporteRepository.save(transporte);
	}

	public Transporte getTransportePorCodigoPedido(Integer codigoPedido) {

		return transporteRepository.findByCodigoPedido(codigoPedido);
	}

	public void updateTransporte(Transporte transporte) {
		Transporte transporteUpdate = transporteRepository.findByCodigoPedido(transporte.getCodigoPedido());
		transporteUpdate.setStatusDoPedido(transporte.getStatusDoPedido());
		transporteRepository.save(transporteUpdate);
	}
}
