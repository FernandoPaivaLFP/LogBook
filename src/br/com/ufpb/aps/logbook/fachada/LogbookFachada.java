package br.com.ufpb.aps.logbook.fachada;

import java.util.List;

import br.com.ufpb.aps.logbook.controlador.GerenciadorAluno;
import br.com.ufpb.aps.logbook.controlador.GerenciadorDisciplina;
import br.com.ufpb.aps.logbook.controlador.GerenciadorLogBook;
import br.com.ufpb.aps.logbook.controlador.GerenciadorPergunta;
import br.com.ufpb.aps.logbook.controlador.GerenciadorPratica;
import br.com.ufpb.aps.logbook.controlador.GerenciadorProfessor;
import br.com.ufpb.aps.logbook.controlador.GerenciadorResposta;
import br.com.ufpb.aps.logbook.controlador.GerenciadorTurma;
import br.com.ufpb.aps.logbook.controlador.GerenciadorUsuario;
import br.com.ufpb.aps.logbook.entidade.Aluno;
import br.com.ufpb.aps.logbook.entidade.Disciplina;
import br.com.ufpb.aps.logbook.entidade.LogBook;
import br.com.ufpb.aps.logbook.entidade.Pergunta;
import br.com.ufpb.aps.logbook.entidade.Pratica;
import br.com.ufpb.aps.logbook.entidade.Professor;
import br.com.ufpb.aps.logbook.entidade.Resposta;
import br.com.ufpb.aps.logbook.entidade.Turma;
import br.com.ufpb.aps.logbook.entidade.Usuario;

public class LogbookFachada {

	GerenciadorAluno galuno = new GerenciadorAluno();
	GerenciadorProfessor gprofessor = new GerenciadorProfessor();
	GerenciadorDisciplina gdisciplina = new GerenciadorDisciplina();
	GerenciadorLogBook glogbook = new GerenciadorLogBook();
	GerenciadorPratica gpratica = new GerenciadorPratica();
	GerenciadorTurma gturma = new GerenciadorTurma();
	GerenciadorUsuario gusuario = new GerenciadorUsuario();
	GerenciadorResposta gresposta = new GerenciadorResposta();
	GerenciadorPergunta gpergunta = new GerenciadorPergunta();

	// Datos do Aluno
	public void adicionarAluno(Aluno aluno) {
		galuno.adicionarAluno(aluno);
	}

	public Aluno pesquisarAluno(String matricula) {
		return galuno.pesquisarAluno(matricula);
	}

	public Aluno EditarDadosAluno(Aluno aluno) {
		return galuno.EditarDadosAluno(aluno);
	}

	public void deletarAluno(String matricula) {
		galuno.deletarAluno(matricula);
	}

	public List<Aluno> listaTodosAlunos() {
		return galuno.getListaTodosAlunos();
	}

	// Dados da Disciplina
	public void adicionarDisciplina(Disciplina disciplina) {
		gdisciplina.adicionarDisciplina(disciplina);
	}

	public Disciplina pesquisarDisciplina(String codigoDisciplina) {
		return gdisciplina.pesquisarDisciplina(codigoDisciplina);
	}

	public Disciplina editarDisciplina(Disciplina disciplina) {
		return gdisciplina.editarDisciplina(disciplina);
	}

	public void deletarDisciplina(String codigoDisciplina) {
		gdisciplina.deletarDisciplina(codigoDisciplina);
	}

	public List<Disciplina> listaDisciplinas() {
		return gdisciplina.getListaDisciplinas();
	}

	//Dados do LogBook
	public LogBook editarLogBook(LogBook logbook) {
		return glogbook.editarLogBook(logbook);
	}
	
	public List<LogBook> listaLogBooks() {
		return glogbook.listaLogBooks();
	}

	// Dados da Pergunta
	public void adicionarPergunta(Pergunta novaPergunta) {
		gpergunta.adicionarPergunta(novaPergunta);
	}

	public Pergunta editarPergunta(Pergunta pergunta) {
		return gpergunta.editarPergunta(pergunta);
	}

	public Pergunta pesquisarPergunta(String pergunta) {
		return gpergunta.pesquisarPergunta(pergunta);
	}

	public void deletarPergunta(String codPergunta) {
		gpergunta.deletarPergunta(codPergunta);
	}

	public List<Pergunta> listPerguntas() {
		return gpergunta.getListPerguntas();
	}

	// Dados da Pr�tica
	public void adicionarPratica(Pratica pratica) {
		gpratica.adicionarPraticaProfessor(pratica);
	}

	public Pratica editarPratica(Pratica pratica) {
		return gpratica.editarPratica(pratica);
	}

	public void deletarPratica(String numeroPratica) {
		gpratica.deletarPratica(numeroPratica);
	}

	public Pratica pesquisarPratica(String numeroPratica) {
		return gpratica.pesquisarPratica(numeroPratica);
	}

	public List<Pratica> listaPraticas() {
		return gpratica.getPraticas();
	}

	// Dados do Professor
	public void adicionarProfessor(Professor professor) {
		gprofessor.adicionarProfessor(professor);
	}

	public Professor pesquisarProfessor(String codigo) {
		return gprofessor.pesquisarProfessor(codigo);
	}

	public Professor editarProfessor(Professor professor) {
		return gprofessor.editarProfessor(professor);
	}

	public void deletarProfessor(String codigo) {
		gprofessor.deletarProfessor(codigo);
	}

	public List<Professor> listaTodosProfessores() {
		return gprofessor.listaTodosProfessores();
	}

	// Dados da Resposta
	public void adicionarRespota(Resposta novaResposta) {
		gresposta.adicionarRespota(novaResposta);
	}

	public Resposta editarResposta(Resposta resposta) {
		return gresposta.editarResposta(resposta);
	}

	public Resposta pesquisarResposta(String codResposta) {
		return gresposta.pesquisarResposta(codResposta);
	}

	public void deletarRespota(String codResposta) {
		gresposta.deletarRespota(codResposta);
	}

	public List<Resposta> listaRespostas() {
		return gresposta.getListaRespostas();
	}

	// Dados da Turma
	public void adicionarTurma(Turma novaTurma) {
		gturma.adicionarTurma(novaTurma);
	}

	public Turma editarTurma(Turma turma) {
		return gturma.editarTurma(turma);
	}

	public void deletarTurma(String codigoTurma) {
		gturma.deletarTurma(codigoTurma);
	}

	public Turma pesquisarTurma(String codigoTurma) {
		return gturma.pesquisarTurma(codigoTurma);
	}

	public List<Turma> listaTurmas() {
		return gturma.getListaTurmas();
	}

	// Dados do Usu�rio
	public void adicionarUsuario(Usuario novoUsuario) {
		gusuario.adicionarUsuario(novoUsuario);
	}

	public void deletarUsuario(Usuario usuario) {
		gusuario.deletarUsuario(usuario);
	}

	public Usuario pesquisarUsuario(String email) {
		return gusuario.pesquisarUsuario(email);
	}

	public List<Usuario> listaTodosUsuarios() {
		return gusuario.getListaTodosUsuarios();
	}
	
	public Usuario editarUsuario(Usuario usuario){
		return gusuario.editarUsuario(usuario);
	}
}
