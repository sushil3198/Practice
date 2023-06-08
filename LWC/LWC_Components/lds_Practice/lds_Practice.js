import { LightningElement, api } from 'lwc';
const field = ['AccountId', 'Name', 'LastName', 'Phone', 'Email'];
export default class Lds_Practice extends LightningElement {
    @api recordId;
    @api objectApiName;
    fields = field;
}