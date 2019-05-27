//
//  createEvent.swift
//  ionixx
//
//  Created by Developer on 29/04/19.
//  Copyright © 2019 Developer. All rights reserved.
//

import UIKit

class createEvent: UIViewController {

    @IBOutlet weak var animator: UIActivityIndicatorView!
    @IBOutlet weak var budget: UITextField!
    @IBOutlet weak var person4name: UITextField!
    @IBOutlet weak var person3name: UITextField!
    @IBOutlet weak var person2name: UITextField!
    @IBOutlet weak var person1name: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    @IBOutlet weak var successfull: UILabel!
    func createevent(){
        UserDefaults.standard.set(person1name.text, forKey: person1name.text!)
        UserDefaults.standard.set(person2name.text, forKey: person2name.text!)
        UserDefaults.standard.set(person3name.text, forKey: person3name.text!)
        UserDefaults.standard.set(person4name.text, forKey: person4name.text!)
        UserDefaults.standard.set(budget.text, forKey: "Budget")
        animator.stopAnimating()
        cleanall()
    }
    func cleanall(){
        
        successfull.isHidden = false
    }
    @IBAction func submitbtnpressed(_ sender: Any) {
        animator.startAnimating()
        createevent()
    }
    @IBAction func closeit(_ sender: Any) {
      dismiss(animated: true, completion: nil)
    }
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
