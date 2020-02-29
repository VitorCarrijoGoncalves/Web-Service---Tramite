package br.com.oab.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Tramite {
	
	private Long idProcesso = 0L;
	private Long tramiteId = 0L;
	private String observacao = "";
	private Long tipoProcessoId = 0L;
	private String tipoProcesso = "";
	private String faseProcesso = "";
	private String tipoTramite = "";
	private String subUnidade = "";
	private String dataTramite = "";
	private String requerenteEstado = "";
	private String requerenteMunicipio = "";
    private String requerenteBairro = "";
    private String requerenteCEP = "";
    private Long tipoTramiteId = 0L;
    private String requerenteNumero = "";
    private Long idProcessoFase = 0L;
    private Long idProcessoInstancia = 0L;
    private String numProcesso = "";
    private String processoInstanciaNome = "";
    private String requerenteComplemento = "";
    private String requerenteCpfCnpj = "";
    private String requerenteDataConclusaoCurso = "";
    private String requerenteDataEmissaoRG = "";
    private String requerenteDataNascimentoFundacao = "";
    private String requerenteEmailCorreio = "";
    private String requerenteLogradouroPrincipal = "";
    private String requerenteNacionalidade = "";
    private String requerenteNaturalidade = "";
    private String requerenteNome = "";
    private String requerenteNomeMae = "";
    private String requerenteNomePai = "";
    private String requerenteNomeSocial = "";
    private String requerentePais = "";
    private String requerenteRegistroConselhoAtual = "";
    private String requerenteRG = "";
    private String requerenteDataCompromisso = "";
    private String situacaoDescricao = "";
    private Long situacaoTramite = 0L;
    private String instituicaoEnsino = "";
    private String dataProtocoloPedidoEmissaoCertificado = "";
    private String subUnidadeConselhoEmail = "";
    private String requerenteRegistroConselhoOrigem = "";
    private String requerenteSubUnidadeOrigem = "";
    private String requerenteCLI_DataInicialSituaca = "";
    private Long requerenteMotivoSituacaoAtual = 0L;
    private String subUnidadeConselho_NomeSubUnidade = "";
    
}
