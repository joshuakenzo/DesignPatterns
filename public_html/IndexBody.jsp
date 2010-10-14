<%@ taglib uri="struts-bean.tld" prefix="bean" %>
<%@ taglib uri="struts-html.tld" prefix="html" %>
<%@ taglib uri="struts-logic.tld" prefix="logic" %>
<%@ taglib uri="fmt.tld" prefix="fmt" %>

<br>

<table cellSpacing="0" cellPadding="0" width="100%" bgColor="#ffffff" border="0">
  <tr>
    <td width="6" background="<html:rewrite page="/imagens/barra_lado_esquerdo.gif" />"><html:img page="/imagens/espacador.gif" width="5" height="17" /></td>
    <td width="60" background="<html:rewrite page="/imagens/barra_background.gif" />" class="titulo_tela_processual">
      Identificação
    </td>
    <td width="6" background="<html:rewrite page="/imagens/barra_central.gif" />"><html:img page="/imagens/espacador.gif" width="3" height="17" /></td>
    <td width="604" background="<html:rewrite page="/imagens/barra_intermediaria.gif" />"><html:img page="/imagens/espacador.gif" width="13" height="15" /></td>
    <td width="14" background="<html:rewrite page="/imagens/barra_intermediaria.gif" />"><html:img page="/imagens/espacador.gif" width="13" height="17" /></td>
  </tr>
</table>

<table cellSpacing="3" cellPadding="1" width="100%" bgColor="#ffffff" border="0">
  <tr>
    <td width="20%" class="titulo_campo_texto">
      <b>CNPJ</b>
    </td>
    <td class="titulo_campo_texto">
      <b>Razão Social</b>
    </td>
  </tr>

  <tr class="texto_normal">
    <td>
      <bean:write name="entidade" property="id" />
      <bean:write name="entidade" property="razaoSocial" />
    </td>
    <td>
      <bean:write name="LocalizarContribuinteForm" property="entidade.cnpjNumero" />
    </td>
    <td>
      <bean:write name="LocalizarContribuinteForm" property="entidade.razaoSocial" />
    </td>
  </tr>

  <tr>
    <td colspan="2" class="titulo_campo_texto">
      <b>Endereço</b>
    </td>
  </tr>

  <tr class="texto_normal">
    <td colspan="2">
      <bean:write name="LocalizarContribuinteForm" property="entidade.enderecoLogradouro" />
    </td>
  </tr>
</table>

<br>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>
      <table border="0" cellpadding="0" cellspacing="0" >
        <tr>
          <td align="left" valign="top" width="60">
            <html:link page="/selecionarsemestre.do">
              <html:img page="/imagens/sistema03.gif" alt="Atualização" width="60" height="60" border="0" />
            </html:link>
          </td>
          <td vAlign="middle" class="letras_azul_bold_pequena">
            <html:link page="/selecionarsemestre.do">
              <span class="letras_azul_bold_pequena">:: ENCAMINHAR DADOS DA RAI AO FNDE :: </span>
            </html:link>
            <br>
            <br>
          </td>
        </tr>
       </table>
	 </td>
    <td>
      <table border="0" cellpadding="0" cellspacing="0" >
        <tr>
          <td align="left" valign="top" width="60">
            <html:link page="/localizarCobranca.do">
              <html:img page="/imagens/sistema01.gif" alt="Consulta" width="60" height="60" border="0" />
            </html:link>
          </td>
          <td vAlign="middle" class="letras_azul_bold_pequena">
            <html:link page="/localizarCobranca.do">
              <span class="letras_azul_bold_pequena">:: VISUALIZAR DADOS DE EMPRESAS ::</span>
            </html:link>
            <br>
            <br>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>

<br>

<table cellSpacing="0" cellPadding="0" width="100%" bgColor="#ffffff" border="0">
  <tr>
    <td width="90%" background="<html:rewrite page="/imagens/barra_intermediaria.gif" />"><html:img page="/imagens/espacador.gif" width="1" height="17" /></td>
    <td width="10%" align="center" nowrap background="<html:rewrite page="/imagens/barra_lado_direito.gif" />"><html:link styleClass="link" page="/localizarcontribuinte.do">:: Voltar ::</html:link></td>
  </tr>
</table>