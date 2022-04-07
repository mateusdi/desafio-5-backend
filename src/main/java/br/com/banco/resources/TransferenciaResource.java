package br.com.banco.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.models.Transferencia;
import br.com.banco.repository.ContaRepository;
import br.com.banco.repository.TransferenciaRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/api")
public class TransferenciaResource {
	
	@Autowired
	TransferenciaRepository transferenciaRepository;
	
	@Autowired
	ContaRepository contaRepository;
	
	//Com paginação.
	@GetMapping(value="/transferencias")
	public ResponseEntity<Page<Transferencia>> listaTodasTransferencias(Pageable pageable){
		return ResponseEntity.ok(transferenciaRepository.findAll(pageable));
	}

//	@GetMapping(value="/transferencias/{contaId}")
//	public List<Transferencia> listaTodasTransferenciass(@PathVariable(value="contaId") Integer contaId,
//			@RequestParam(value="nomeOperador", required=false) String nomeOperador
//			){
//		return transferenciaRepository.findAllTransferenciasByContaId(contaId);
//	}
	
//	@GetMapping(value="/conta/{idConta}/transferencias")
//	public Conta contaTransferencias(@PathVariable("idConta") Integer idConta, 
//			@RequestParam(value="descricao", required=false) String descricao){
//		return contaRepository.findById(idConta).get();
//	}
	
}
