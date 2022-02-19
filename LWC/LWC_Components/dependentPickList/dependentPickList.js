import { LightningElement } from 'lwc';
import getMenuValues from '@salesforce/apex/FoodMenuController.returnValue'

export default class DependentPickList extends LightningElement {
    pickValue;
    pickOptions = [
        { label: 'Veg', value: 'veg' },
        { label: 'Non Veg', value: 'nonveg' }
    ];
    apexResponse;
    pick2Value;
    pick2Options;

    pickValueHandler(event) {
        this.pickValue = event.detail.value;
        console.log(this.pickValue);

        getMenuValues({ str: this.pickValue }).then(response => {

            this.apexResponse = response;
            console.log('Response======>', this.apexResponse);

            let lstOptions = [];
            for (var i = 0; i < this.apexResponse.length; i++) {
                lstOptions.push({ label: this.apexResponse[i], value: this.apexResponse[i] });
            }
            console.log(lstOptions);
            this.pick2Options = lstOptions;
            console.log(this.pick2Options)
        }).catch(error => { console.error('Error---->', error) })

    }



}