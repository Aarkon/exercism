use piglatin::*;

#[test]
fn test_1() {
    assert_eq!("appleay", translate("apple"));
}

#[test]
fn test_2() {
    assert_eq!("ear", translate("earay"));
}

#[test]
fn test_3() {
    assert_eq!("pig", translate("pig"));
}

#[test]
fn test_4() {
    assert_eq!("koala", translate("oalakay"));
}

#[test]
fn test_5() {
    assert_eq!("chair", translate("airchay"));
}

#[test]
fn test_6() {
    assert_eq!("queen", translate("eenquay"));
}

#[test]
fn test_7() {
    assert_eq!("quick fast run", translate("ickquay astfay unray"));
}