package org.egov.hc.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.egov.tracer.config.TracerConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@Import({ TracerConfiguration.class })
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class HCConfiguration {


	@Value("${app.timezone}")
	private String timeZone;

	@PostConstruct
	public void initialize() {
		TimeZone.setDefault(TimeZone.getTimeZone(timeZone));
	}

	@Bean
	@Autowired
	public MappingJackson2HttpMessageConverter jacksonConverter(ObjectMapper objectMapper) {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(objectMapper);
		return converter;
	}
	
	 @Value("${egov.hc.default.limit}")
	    private Integer defaultLimit;

	    @Value("${egov.hc.default.offset}")
	    private Integer defaultOffset;

	    @Value("${egov.hc.max.limit}")
	    private Integer maxSearchLimit;


	    @Value("${kafka.topics.save.service}")
	    private String saveTopic;
	
	    @Value("${egov.mdms.host}")
	    private String mdmsHost;
	    
	    @Value("${egov.mdms.get.endpoint}")
	    private String mdmsGetEndpoint;
	    
	    @Value("${egov.mdms.action.host}")
	    private String actionHost;
	    
	    @Value("${egov.mdms.action.get.endpoint}")
	    private String mdmsActionGetEndpoint;


	    @Value("${egov.mdms.search.endpoint}")
	    private String mdmsEndpoint;	
	    
	    @Value("${is.external.workflow.enabled}")
	    private Boolean isExternalWorkFlowEnabled;
	    
	 // Workflow
	    
	    @Value("${create.hc.workflow.name}")
	    private String hcBusinessServiceValue;
	    
	    @Value("${workflow.context.path}")
	    private String wfHost;
	    
	    @Value("${workflow.process.search.path}")
	    private String wfProcessSearch;

	    @Value("${workflow.transition.path}")
	    private String wfTransitionPath;
	    
	    @Value("${persister.insert.request.device.source}")
		private String requestDeviceSource;
	    
	    @Value("${egov.hrms.host}")
		private String egovHRMShost;

		@Value("${egov.hrms.search.endpoint}")
		private String egovHRMSSearchEndpoint;
	
		//Allowed Search Parameters
		@Value("${citizen.allowed.search.params}")
		private String allowedCitizenSearchParameters;
		
		@Value("${employee.allowed.search.params}")
		private String allowedEmployeeSearchParameters;
	
	    //Idgen Config
	    @Value("${egov.idgen.host}")
	    private String idGenHost;
	
	    @Value("${egov.idgen.path}")
	    private String idGenPath;
	
	    @Value("${egov.idgen.hc.serviceRequestNum.name}")
	    private String applicationNumberIdgenName;
	    
	    @Value("${egov.idgen.hc.serviceRequestNum.format}")
	    private String applicationNumberIdgenFormat;

	    @Value("${workflow.businessservice.search.path}")
	    private String wfBusinessServiceSearchPath;
	
		@Value("${kafka.topics.notification.sms}")
		private String smsNotifTopic;

		@Value("${kafka.topics.notification.email}")
		private String emailNotifTopic;

		@Value("${notification.sms.enabled}")
		private Boolean isSMSNotificationEnabled;

		@Value("${notification.email.enabled}")
		private Boolean isEmailNotificationEnabled;
		
		@Value("${date.format.notification}")
		private String notificationDateFormat;

		@Value("${egov.ui.app.host}")
		private String uiAppHost;

		@Value("${notification.allowed.on.status}")
		private String notificationEnabledStatuses;

		@Value("${notification.fallback.locale}")
		private String fallbackLocale;

		@Value("${egov.usr.events.notification.enabled}")
		private Boolean isUsrEventNotificationEnabled;

		@Value("${egov.usr.events.create.topic}")
		private String saveUserEventsTopic;
		
		
		@Value("${egov.usr.events.create.topic}")
		private String saveUserEventsTopc;
		
		@Value("${kafka.topics.update.serviceRequest.service}")
		private String updateServiceRequestData;

		@Value("${kafka.topics.update.service}")
		private String updateTopic;
		
		@Value("${kafka.topics.update.status.service}")
		private String updateStatusTopic;

		@Value("${egov.user.host}")
		private String userBasePath;

		@Value("${egov.user.search.endpoint}")
		private String userSearchEndPoint;

		@Value("${egov.user.create.endpoint}")
		private String userCreateEndPoint;
		

		@Value("${egov.localization.host}")
		private String localizationHost;

		@Value("${egov.localization.search.endpoint}")
		private String localizationSearchEndpoint;

		@Value("${egov.user.host}")
		private String egovUserHost;

		@Value("${egov.user.search.endpoint}")
		private String egovUserSearchEndpoint;

}