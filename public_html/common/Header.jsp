<%@ taglib uri="struts-bean.tld" prefix="bean" %>
<%@ taglib uri="struts-html.tld" prefix="html" %>
<%@ taglib uri="struts-tiles.tld" prefix="tiles" %>

<TABLE class="fundo_laranja" cellSpacing="0" cellPadding="1" width="100%" border="0">
  <TR>
    <TD vAlign="center" noWrap rowSpan="2"><html:img pageKey="icon.header.fndelogo.img" height="35" width="97" /></TD>
    <TD vAlign="center" noWrap rowSpan="2">&nbsp; </TD>
    <TD class="cabecalho_letras" vAlign="center" noWrap align="right" width="100%">&nbsp;</TD>
    <TD vAlign="center" noWrap rowSpan="2">&nbsp;</TD>
    <TD vAlign="center" noWrap rowSpan="2"><html:img height="42" pageKey="icon.header.meclogo.img" width="97" align="absMiddle"/></TD>
  </TR>
  <TR>
    <TD class="cabecalho_letras" vAlign="middle" noWrap align="left" width="100%">Fundo Nacional de<BR>Desenvolvimento da Educação</TD>
  </TR>
</TABLE>

<tiles:useAttribute name="titleKey" scope="request" ignore="true"/>

<TABLE cellSpacing="0" cellPadding="0" width="100%" border="0">
  <TR>
    <TD class="pagina_titulo" align="center" width="100%">
      <bean:message name="titleKey"/>
    </TD>
  </TR>
</TABLE>