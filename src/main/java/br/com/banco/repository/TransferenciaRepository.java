package br.com.banco.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.banco.models.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {
	@Query(value = "SELECT * FROM transferencia as t WHERE t.conta_id = :contaId ", nativeQuery = true)
	List<Transferencia> findAllTransferenciasByContaId(Integer contaId);

}
