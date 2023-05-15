/*-
 * #%L
 * HAPI FHIR Test Utilities
 * %%
 * Copyright (C) 2014 - 2023 Smile CDR, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package ca.uhn.fhir.parser;

import ca.uhn.fhir.context.FhirContext;

abstract public non-sealed class AbstractJsonParserErrorHandlerTest extends AbstractParserErrorHandlerTest {

	private static String PATIENT_DUPLICATE_CHOICE = 
			""" 
			{
				"resourceType": "Patient",
				"deceasedBoolean": "true",
				"deceasedDateTime": "2022-02-07T13:28:17-05:00"
			}
			""";

	protected abstract FhirContext getFhirContext();
	
	@Override
	protected IParser createParser() {
		return getFhirContext().newJsonParser();
	}

	@Override
	protected String createResourceWithRepeatingChoice() {
		return PATIENT_DUPLICATE_CHOICE;
	}

}