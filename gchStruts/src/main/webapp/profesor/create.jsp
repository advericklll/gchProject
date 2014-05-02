<%-- 
    Document   : create
    Created on : 19-mar-2014, 2:36:14
    Author     : Lucas
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" href="../css/jquery-ui-1.10.4.css">
<script src="../js/jquery-ui-1.10.4.js"></script>
<script src="../js/registroScript.js"></script>

<s:if test="profesor.codigo==null || profesor.codigo==0">
    <h1>
        <s:text name="title.new">
            <s:param><s:text name="module.professor"/></s:param>
        </s:text>   
    </h1>
</s:if>
<s:else>
    <h1>
        <s:text name="title.update">
            <s:param><s:text name="module.professor"/></s:param>
        </s:text>      
    </h1>
</s:else>

<s:div cssStyle="width: 40%">
    <s:form method="post" cssClass="form-horizontal" role="form" validate="true">        
        <fieldset>
            <s:hidden name="profesor.codigo"/>
            <legend><s:text name="professor.form.personal"/></legend>
            <s:div cssClass="form-group" >
                <label for="profesor.nombres" class="col-sm-4 control-label"><s:text name="professor.form.firstname"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.nombres" cssClass="form-control" id="nombres" 
                                 maxLength="50" placeholder="%{getText('professor.form.firstname')}" />                       
                </s:div>                    
            </s:div> 
            <s:div cssClass="form-group">
                <label for="profesor.apellidoPaterno" class="col-sm-4 control-label"><s:text name="professor.form.midname"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.apellidoPaterno" cssClass="form-control" id="apellidoPaterno" 
                                 maxLength="50" placeholder="%{getText('professor.form.midname')}" />            
                </s:div>                    
            </s:div> 
            <s:div cssClass="form-group">
                <label for="profesor.apellidoMaterno" class="col-sm-4 control-label"><s:text name="professor.form.lastname"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.apellidoMaterno" cssClass="form-control" id="apellidoMaterno" 
                                 maxLength="50" placeholder="%{getText('professor.form.lastname')}" />            
                </s:div>                    
            </s:div> 
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.address"/></legend>
            <s:div cssClass="form-group">
                <label for="profesor.direccion" class="col-sm-4 control-label"><s:text name="professor.form.address.complete"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.direccion" cssClass="form-control" id="direccion" 
                                 maxLength="400" placeholder="%{getText('professor.form.address.complete')}" />                     
                </s:div>                    
            </s:div>
            <s:div cssClass="form-group">
                <label for="profesor.referencia" class="col-sm-4 control-label"><s:text name="professor.form.address.reference"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.referencia" cssClass="form-control" id="referencia" 
                                 maxLength="400" placeholder="%{getText('professor.form.address.reference')}"/>             
                </s:div>                    
            </s:div>
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.phones"/></legend>
            <s:div cssClass="form-group">
                <label for="profesor.telefono1"  class="col-sm-4 control-label"><s:text name="professor.form.phones.phone1"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.telefono1" cssClass="form-control" id="telefono1" 
                                 placeholder="%{getText('professor.form.phones.phone1')}"/>         
                </s:div>                   
            </s:div>
            <s:div cssClass="form-group">
                <label for="profesor.telefono2"  class="col-sm-4 control-label"><s:text name="professor.form.phones.phone2"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.telefono2" cssClass="form-control" id="telefono2" 
                                 placeholder="%{getText('professor.form.phones.phone2')}"/>                  
                </s:div>                  
            </s:div>                
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.emails"/></legend>
            <s:div cssClass="form-group">
                <label for="profesor.email1" class="col-sm-4 control-label"><s:text name="professor.form.emails.email1"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.email1" cssClass="form-control" id="email1" 
                                 maxLength="100" placeholder="%{getText('professor.form.emails.email1')}"/>              
                </s:div>                    
            </s:div>
            <s:div cssClass="form-group">
                <label for="profesor.email2" class="col-sm-4 control-label"><s:text name="professor.form.emails.email2"/></label>
                <s:div cssClass="col-sm-8">
                    <s:textfield name="profesor.email2" cssClass="form-control" id="email2" 
                                 maxLength="100" placeholder="%{getText('professor.form.emails.email2')}"/>              
                </s:div>                     
            </s:div>                
        </fieldset>
        <fieldset>
            <legend><s:text name="professor.form.details"/></legend>

            <s:div cssClass="form-group">
                <label for="profesor.fechaNacimiento" class="col-sm-4 control-label">
                    <s:text name="professor.form.details.birthday"/>
                </label>
                <s:div cssClass="col-sm-8">    
                    <s:textfield name="profesor.fechaNacimiento" cssClass="form-control" id="fechaNacimiento" 
                                 readonly="true" />                    
                </s:div>
            </s:div>
            <s:div cssClass="form-group">
                <label class="col-sm-4 control-label"><s:text name="professor.form.details.sex"/></label>
                <s:div cssClass="col-sm-8">
                    <s:div cssClass="radio-inline">                        
                        <input name="sexo" type="radio" id="masculino" value="M" />
                        <s:text name="professor.form.details.sex.male"/>
                    </s:div>
                    <s:div cssClass="radio-inline">                        
                        <input name="sexo" type="radio" id="femenino" value="F" /> 
                        <s:text name="professor.form.details.sex.female"/>
                    </s:div>
                        <s:hidden id="sexo1" name="profesor.genero.codigo"/>                    
                </s:div>
            </s:div>
            <s:div cssClass="form-group">
                <label class="col-sm-4 control-label" for="profesor.estadoCivil,codigo">
                    <s:text name="professor.form.details.marital"/>
                </label>
                <s:div cssClass="col-sm-8">
                    <s:hidden id="civil" name="profesor.estadoCivil.codigo"/>
                    <select name="estadoCivil" id="estadoCivil" class="form-control">
                        <option value=""><s:text name="professor.form.details.estado.seleccione"/></option>
                        <option value="1"><s:text name="professor.form.details.estado.soltero"/></option>
                        <option value="2"><s:text name="professor.form.details.estado.casado"/></option>
                        <option value="3"><s:text name="professor.form.details.estado.vuido"/></option>
                        <option value="4"><s:text name="professor.form.details.estado.divorciado"/></option>
                        <option value="5"><s:text name="professor.form.details.estado.conviviente"/></option>
                    </select>
                </s:div>                  
            </s:div>
        </fieldset>
        <s:submit name="Registrar" cssClass="btn btn-primary btn-lg" 
                  key="professor.form.button" action="confirmarProfesor" namespace="/profesor"/>        
    </s:form>
</s:div>
