var API_URL = 'http://localhost:8080/javabank5/api/customer';

function customerServiceConstruction() {

	function superAjax(successCB, endpoint) {
		$.ajax({
			url: endpoint.url,
			type: endpoint.type,
			async: true,
			data: endpoint.data ? JSON.stringify(customerData) : undefined,
			success: successCB,
			error: function (error) {
				// displayError
			}
		})
	}

	return {
		list: function listCustomers() {
			
			superAjax(displayCustomers, { url: API_URL, type: 'GET' })
		},
		deleteCustomer: function deleteCustomer(id) {
			superAjax(listCustomers, API_URL + "/" + id, 'DELETE')
		},
		edit: function editCustomer(customer) {
			superAjax(listCustomers, API_URL + "/" + customer.id, 'PUT', customer)
		},
		add: function addCustomer(customer) {
			superAjax(listCustomers, API_URL, 'POST', customer)
		}
	}
	
}

var customerService = customerServiceConstruction()
customerService.add()
customerService.delete()