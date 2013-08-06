INSERT INTO `krew_doc_typ_t` (`DOC_TYP_ID`, `PARNT_ID`, `DOC_TYP_NM`, `DOC_TYP_VER_NBR`, `ACTV_IND`, `CUR_IND`, `LBL`, `PREV_DOC_TYP_VER_NBR`, `DOC_TYP_DESC`, `DOC_HDLR_URL`, `POST_PRCSR`, `JNDI_URL`, `BLNKT_APPR_PLCY`, `ADV_DOC_SRCH_URL`, `RTE_VER_NBR`, `NOTIFY_ADDR`, `APPL_ID`, `EMAIL_XSL`, `SEC_XML`, `VER_NBR`, `BLNKT_APPR_GRP_ID`, `RPT_GRP_ID`, `GRP_ID`, `HELP_DEF_URL`, `OBJ_ID`, `DOC_SEARCH_HELP_URL`, `DOC_HDR_ID`, `AUTHORIZER`) VALUES
('3010', '2681', 'LeaveApplicationDocumentType', '0', '1', '1', 'Bonsai leave application', NULL, 'Bonsai leave appilication workflow document type', '${application.url}/mvc/leaveApplication?methodToCall=docHandler&viewId=LeaveApplicationView', 'org.kuali.rice.krad.workflow.postprocessor.KualiPostProcessor', NULL, NULL, NULL, '2', NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, '', '5512f884-be3e-4a57-8150-8d9c69653bef', '', NULL, NULL);

INSERT INTO `krim_perm_t` (`PERM_ID`, `OBJ_ID`, `VER_NBR`, `PERM_TMPL_ID`, `NMSPC_CD`, `NM`, `DESC_TXT`, `ACTV_IND`) VALUES
('10003', '206d534d-5655-4302-ab98-21846679bc06', '1', '10', 'KR-SYS', 'Initiate Leave Application', 'Initiate Leave Application Document', 'Y');

INSERT INTO `krim_role_t` (`ROLE_ID`, `OBJ_ID`, `VER_NBR`, `ROLE_NM`, `NMSPC_CD`, `DESC_TXT`, `KIM_TYP_ID`, `ACTV_IND`, `LAST_UPDT_DT`) VALUES
('10004', 'f5608e0d-b350-4b1f-8715-9400ff62b4e8', '1', 'Leave Application Role', 'KR-SYS', 'Leave Application Role', '1', 'Y', NULL);

INSERT INTO `krim_role_perm_t` (`ROLE_PERM_ID`, `OBJ_ID`, `VER_NBR`, `ROLE_ID`, `PERM_ID`, `ACTV_IND`) VALUES
('10000', '8a04417e-82c5-41f9-a589-ae7338b90a62', '1', '10004', '10003', 'Y');

INSERT INTO `krim_role_mbr_t` (`ROLE_MBR_ID`, `VER_NBR`, `OBJ_ID`, `ROLE_ID`, `MBR_ID`, `MBR_TYP_CD`, `ACTV_FRM_DT`, `ACTV_TO_DT`, `LAST_UPDT_DT`) VALUES
('10003', '3', 'b97eb004-4a7c-4cbb-8870-4e82188e0dec', '10004', 'admin', 'P', NULL, NULL, NULL);
