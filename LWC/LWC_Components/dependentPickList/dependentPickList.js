import { LightningElement } from 'lwc';

export default class DependentPickList extends LightningElement {
    pickValue;
    pickOptions = [
        {label : 'Veg', value : 'veg'},
        {label: 'Non Veg', value : 'nonveg'}
    ];

    pickValueHandler(event) {
        this.pickValue = event.detail.value;
        console.log(this.pickValue);
    }
}