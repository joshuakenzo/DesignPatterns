<%@ page isErrorPage="true" %>
<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic"%>

<html:html>
<head>
    <title>:: FNDE - Fundo Nacional de Desenvolvimento da Educação</title>   
        <link rel="stylesheet" type="text/css" media="all" 
            href="./css/estilo_padrao.css" /> 
</head>

<body leftMargin="0" topMargin="0" marginheight="0" marginwidth="0">

 <!-- Header -->
<!-- TAGs típicas do Struts -->

<TABLE class="cabecalho_fundo" cellSpacing="0" cellPadding="1" width="100%" border="0">
  <TR>
    <TD vAlign="center" noWrap rowSpan="2"><img src="../../Templates/imagens/logomarca_fnde.gif" height="35" width="97"></TD>
    <TD vAlign="center" noWrap rowSpan="2">&nbsp; </TD>
    <TD class="cabecalho_letras" vAlign="center" noWrap align="right" width="100%">&nbsp;</TD>
    <TD vAlign="center" noWrap rowSpan="2">&nbsp;</TD>
    <TD vAlign="center" noWrap rowSpan="2"><img src="../../Templates/imagens/logomarca_mec.gif" height="42" width="97" align="absMiddle"></TD>
  </TR>
  <TR>
    <TD class="cabecalho_letras" vAlign="center" noWrap align=left width="100%">Fundo Nacional de<BR>Desenvolvimento da Educação</TD>
  </TR>
</TABLE>


<TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
  <TR>
    <TD class="pagina_titulo" align="center" width="100%">
	<strong>
      <% exception = (Exception) request.getAttribute("exception"); %>
        <%= exception.getMessage() %>
<!--        < exception.printStackTrace(new PrintWriter(out)); >  -->
	</strong><BR>
   </TD>
  </TR>
</TABLE>

<!-- Message -->
<TABLE width="100%" border=0>

</TABLE>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr> 
    <td class="letras_azul_bold_pequena  align="center"><div align="center"><font size="2"><br>
        <br>
        <br>
        <br>
        INFORMA&Ccedil;&Otilde;ES DO &Oacute;RG&Atilde;O EXCLU&Iacute;DAS COM SUCESSO.
		<br>
        <a href="/sipor/manterCorVeiculo.do">Voltar</a><br>
        </a><br>
        <br>
        <br>
        <br>
        <br>
        <br>
        </font> </div>
		</tr>
  <tr>
    <td  align="center" background="../../Templates/imagens/barradadoscae2.gif"><img src="../../Templates/imagens/dot.gif" width="1" height="17"></td>
  </tr>
</table>  
</body>
</html:html>

