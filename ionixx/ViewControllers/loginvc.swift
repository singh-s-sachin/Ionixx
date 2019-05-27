//
//  loginvc.swift
//  ionixx
//
//  Created by Developer on 29/04/19.
//  Copyright © 2019 Developer. All rights reserved.
//

import UIKit

class loginvc: UIViewController {
    let value1 = UserDefaults.standard.object(forKey: "admin")
    // Do any additional setup
    @IBOutlet weak var password: UITextField!
    @IBOutlet weak var wrongpwd: UILabel!
    @IBOutlet weak var id: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()
        if ((UserDefaults.standard.object(forKey: "isLoggedIn")) != nil){
            performSegue(withIdentifier: "tologgedin", sender: nil)
        }
    
    }
    func performlogin(){
        if(id.text == "admin")
        {
           if(password.text == value1 as? String)
           {
            performSegue(withIdentifier: "tologgedin", sender: nil)
            UserDefaults.standard.set(id.text, forKey: "isLoggedIn")
            }
            else
           {
            wrongpwd.isHidden = false
            }
        }
        else
        {
            let k = UserDefaults.standard.object(forKey: id.text!)
            if (k as? String == password.text){
                performSegue(withIdentifier: "touser", sender: nil)
            }
        }
    }
    @IBAction func submitbtnpressed(_ sender: Any) {
        self.performlogin()
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
