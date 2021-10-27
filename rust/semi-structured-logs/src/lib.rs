// This stub file contains items which aren't used yet; feel free to remove this module attribute
// to enable stricter warnings.
#![allow(unused)]

use core::fmt;
use std::fmt::Formatter;
use crate::LogLevel::{Error, Info, Warning};

/// various log levels
#[derive(Clone, PartialEq, Debug)]
pub enum LogLevel {
    Info,
    Warning,
    Error,
}

impl fmt::Display for LogLevel {
    fn fmt(&self, f: &mut Formatter) -> fmt::Result {
        fmt::Debug::fmt(self, f)
    }
}
/// primary function for emitting logs
pub fn log(level: LogLevel, message: &str) -> String {
    format!("[{}]: {}", level.to_string().to_uppercase(), message)
}
pub fn info(message: &str) -> String {
    log(Info, message)
}
pub fn warn(message: &str) -> String {
    log(Warning, message)
}
pub fn error(message: &str) -> String {
    log(Error, message)
}
