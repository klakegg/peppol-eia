/*
 * Version: MPL 1.1/EUPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at:
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Copyright The PEPPOL project (http://www.peppol.eu)
 *
 * Alternatively, the contents of this file may be used under the
 * terms of the EUPL, Version 1.1 or - as soon they will be approved
 * by the European Commission - subsequent versions of the EUPL
 * (the "Licence"); You may not use this work except in compliance
 * with the Licence.
 * You may obtain a copy of the Licence at:
 * http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * If you wish to allow use of your version of this file only
 * under the terms of the EUPL License and not to allow others to use
 * your version of this file under the MPL, indicate your decision by
 * deleting the provisions above and replace them with the notice and
 * other provisions required by the EUPL License. If you do not delete
 * the provisions above, a recipient may use your version of this file
 * under either the MPL or the EUPL License.
 */
package org.busdox.transport.Identifiers;

/**
 * Identifier defined by the PEPPOL Commons Documentation.
 *
 * @author Jose Gorvenia Narvaez(jose@alfa1lab.com)
 */
public class Identifiers {

    public static final String NAMESPACE_LIME = "http://busdox.org/transport/lime/1.0/";
    public static final String NAMESPACE_TRANSPORT_IDS = "http://busdox.org/transport/identifiers/1.0/";
    public static final String MESSAGEID = "MessageIdentifier";
    public static final String CHANNELID = "ChannelIdentifier";
    public static final String PAGEIDENTIFIER = "PageIdentifier";
    public static final String SERVICENAME = "wstransferService";
    public static final String SENDERID = "SenderIdentifier";
    public static final String RECIPIENTID = "RecipientIdentifier";
    public static final String DOCUMENTID = "DocumentIdentifier";
    public static final String PROCESSID = "ProcessIdentifier";
    public static final String SCHEME_ATTR = "scheme";
    public static final String BUSDOX_NO_PROCESS = "busdox:noprocess";
    public static final String BUSDOX_PROCID_TRANSPORT = "busdox-procid-transport";
    public static final String PING_SENDER_SCHEME = "busdox-actorid-transport";
    public static final String PING_SENDER_VALUE = "busdox:sender";
    public static final String PING_RECPIENT_SCHEME = "busdox-actorid-transport";
    public static final String PING_RECIPIENT_VALUE = "busdox:recipient";
    public static final String PING_DOCUMENT_SCHEME = "busdox-docid-qns";
    public static final String PING_DOCUMENT_VALUE = "busdox:ping";
    public static final String PING_PROCESS_SCHEME = "busdox-procid-transport";
    public static final String PING_PROCESS_VALUE = "busdox:noprocess";
    public static final String MESSAGEUNDELIVERABLE_SENDER_SCHEME = "busdox-actorid-transport";
    public static final String MESSAGEUNDELIVERABLE_SENDER_VALUE = "busdox:sender";
    public static final String MESSAGEUNDELIVERABLE_DOCUMENT_SCHEME = "busdox-docid-qns";
    public static final String MESSAGEUNDELIVERABLE_DOCUMENT_VALUE = "http://busdox.org/transport/lime/1.0/::MessageUndeliverable";
    public static final String MESSAGEUNDELIVERABLE_PROCESS_SCHEME = "busdox-procid-transport";
    public static final String MESSAGEUNDELIVERABLE_PROCESS_VALUE = "busdox:noprocess";
}
