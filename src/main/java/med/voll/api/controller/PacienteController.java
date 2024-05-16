package med.voll.api.controller;

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import med.voll.api.domain.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
@SecurityRequirement(name = "bearer-key")
public class PacienteController {
=======
import jakarta.validation.Valid;
import med.voll.api.paciente.DadosAtualizacaoPaciente;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.DadosListagemPacientes;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController{
>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
<<<<<<< HEAD
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
=======
    public void  cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){
>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746
        repository.save(new Paciente(dados));
    }

    @GetMapping
<<<<<<< HEAD
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
=======
    public List<DadosListagemPacientes> listar(){
        return repository.findAll().stream().map(DadosListagemPacientes::new).toList();
>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746
    }

    @PutMapping
    @Transactional
<<<<<<< HEAD
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados) {
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
=======
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746
    }

    @DeleteMapping("/{id}")
    @Transactional
<<<<<<< HEAD
=======
//    public void excluir(@PathVariable Long id){
//        repository.deleteById(id);
//    }

>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746
    public void excluir(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.excluir();
    }

<<<<<<< HEAD

=======
>>>>>>> 3f58f9e61c24eb35e694b53387087f9d73fb9746
}
