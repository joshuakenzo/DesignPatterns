<%@ taglib uri="struts-bean.tld" prefix="bean" %>
<%@ taglib uri="struts-tiles.tld" prefix="tiles" %>

<tiles:useAttribute name="titleKey" scope="request" ignore="true"/>

<TABLE cellSpacing="3" cellPadding="1" width="100%" border="0">
  <TR>
    <TD class="pagina_titulo" align="center" width="100%">
      <bean:message name="titleKey"/>
    </TD>
  </TR>
</TABLE>